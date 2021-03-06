import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

 
public class Ex01 {
 
    public static void main(String[] args) {
 
        Ex01 selTest = new Ex01();
        selTest.crawl();
        
    }
 
    
    //WebDriver
    private WebDriver driver;
    
    //Properties
    public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
    public static final String WEB_DRIVER_PATH = "chromedriver.exe";
    
    //크롤링 할 URL
    private String base_url;
    
    public Ex01() {
        super();
 
        //System Property SetUp
        System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
        
        //Driver SetUp
        driver = new ChromeDriver();
        base_url = "https://search.naver.com/search.naver?sm=tab_hty.top&where=image";
    }
 
    public void crawl() {
 
        try {
            //get page (= 브라우저에서 url을 주소창에 넣은 후 request 한 것과 같다)
            driver.get(base_url);
            
            WebElement elem = driver.findElement(By.name("query"));
            elem.sendKeys("오버워치");
            elem.sendKeys(Keys.RETURN);
            
            JavascriptExecutor js = (JavascriptExecutor)driver;
            
            Long last_height = (Long)js.executeScript("return document.body.scrollHeight");
            
            while (true) {
            	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
            	
            	try {
            		Thread.sleep(800);
            	} catch(InterruptedException e) { e.printStackTrace(); }
            	
            	Long new_height = (Long)js.executeScript("return document.body.scrollHeight");
            	
            	if (new_height.equals(last_height)) {
            		try {
            			driver.findElement(By.cssSelector(".btn_more._more")).click();
            		}
            		catch (Exception e) {
						break;
					}
            	}
            	
            	last_height = new_height;
            }
            
            List<WebElement> images = new ArrayList<WebElement>(driver.findElements(By.cssSelector(".img_border")));
            
            int count = 1;
            
            for (WebElement image : images) {
            	try {
            		image.click();
            		String imgUrl = driver.findElement(By.cssSelector("._image_source")).getAttribute("src");
            		
            		System.out.println(imgUrl);

            		URL url = new URL(imgUrl);
            		InputStream in = new BufferedInputStream(url.openStream());
            		ByteArrayOutputStream out = new ByteArrayOutputStream();
            		byte[] buf = new byte[1024];
            		int n = 0;
            		while (-1!=(n=in.read(buf))) {
            		   out.write(buf, 0, n);
            		}
            		out.close();
            		in.close();
            		byte[] response = out.toByteArray();


            		//폴더 생성
            		File fileDir  = new File("download/");
            		if(!fileDir.isDirectory()){
            		 fileDir.mkdirs();
            		}

            		//원하는 경로에 이미지다운로드
            		File fileData = new File("download/", count + ".jpg");
            		if (!fileData.exists()) { // 해당 경로에 동일한 파일명이 이미 존재하지않는 경우 파일생성
            		 FileOutputStream fos = new FileOutputStream("download/" + count + ".jpg");
            		 fos.write(response);
            		 fos.close();
            		}


            		count++;
            		
            	}
            	catch (Exception e) {
					e.printStackTrace();
				}
            }
            
            
    
        } catch (Exception e) {
            
            e.printStackTrace();
        
        } finally {
      
            driver.close();
        }
 
    }
 
}