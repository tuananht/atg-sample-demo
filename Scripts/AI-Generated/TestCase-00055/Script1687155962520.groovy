import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_log-viewer-slows-down-your-tests-how-to-prevent-it'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/log-viewer-slows-down-your-tests-how-to-prevent-it/60252')

'step 2: Add visual checkpoint at Page_t_log-viewer-slows-down-your-tests-how-to-prevent-it'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00055_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
