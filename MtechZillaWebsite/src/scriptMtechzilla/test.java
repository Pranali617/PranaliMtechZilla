package scriptMtechzilla;

public class test extends CheckMtechZilla{
	public  static String service="//a[contains(text(),\"Services\")]";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		CheckMtechZilla obj=new CheckMtechZilla();
		obj.initialization();
		obj.mouseHoverActionClass();
		obj.clickElement(service);
		obj.closeBrowser();
	}
}
