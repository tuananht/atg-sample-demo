import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_need-help-with-root-cause-java-lang-illegalargumentexception-object-is-null'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/need-help-with-root-cause-java-lang-illegalargumentexception-object-is-null/18240')

'step 2: Add visual checkpoint at Page_t_need-help-with-root-cause-java-lang-illegalargumentexception-object-is-null'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00100_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
