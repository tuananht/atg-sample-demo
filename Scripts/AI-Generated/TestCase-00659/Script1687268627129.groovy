import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_running-a-test-may-cause-java-lang-classformaterror-truncated-class-file'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/running-a-test-may-cause-java-lang-classformaterror-truncated-class-file/60575')

'step 2: Add visual checkpoint at Page_t_running-a-test-may-cause-java-lang-classformaterror-truncated-class-file'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00659_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
