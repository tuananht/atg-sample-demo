import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_root-cause-java-lang-illegalargumentexception-objectis-null-what-is-the-source-of-the-problem'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/root-cause-java-lang-illegalargumentexception-objectis-null-what-is-the-source-of-the-problem/5997')

'step 2: Add visual checkpoint at Page_t_root-cause-java-lang-illegalargumentexception-objectis-null-what-is-the-source-of-the-problem'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00099_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
