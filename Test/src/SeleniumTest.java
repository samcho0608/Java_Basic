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

 
public class SeleniumTest {
 
    public static void main(String[] args) {
 
        SeleniumTest selTest = new SeleniumTest();
        selTest.crawl();
        
    }
 
    
    //WebDriver
    private WebDriver driver;
    
    //Properties
    public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
    public static final String WEB_DRIVER_PATH = "E:/chromedriver.exe";
    
    //ũ�Ѹ� �� URL
    private String base_url;
    
    public SeleniumTest() {
        super();
 
        //System Property SetUp
        System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
        
        //Driver SetUp
        driver = new ChromeDriver();
        base_url = "https://search.naver.com/search.naver?sm=tab_hty.top&where=image";
    }
 
    public void crawl() {
 
        try {
            //get page (= ���������� url�� �ּ�â�� ���� �� request �� �Ͱ� ����)
            driver.get(base_url);
            
            WebElement elem = driver.findElement(By.name("query"));
            elem.sendKeys("������ġ");
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


            		//���� ����
            		File fileDir  = new File("E:/", "Test2");
            		if(!fileDir.isDirectory()){
            		 fileDir.mkdirs();
            		}

            		//���ϴ� ��ο� �̹����ٿ�ε�
            		File fileData = new File("E:/Test2/", count + ".jpg");
            		if (!fileData.exists()) { // �ش� ��ο� ������ ���ϸ��� �̹� ���������ʴ� ��� ���ϻ���
            		 FileOutputStream fos = new FileOutputStream("E:/Test2/" + count + ".jpg");
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