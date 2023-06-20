import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_test-case-is-not-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/test-case-is-not-running/46163/3')

'step 2: Add visual checkpoint at Page_t_test-case-is-not-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01334_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
