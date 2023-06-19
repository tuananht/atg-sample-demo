import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_verify-output-web-url'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/verify-output-web-url/13455')

'step 2: Add visual checkpoint at Page_t_verify-output-web-url'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00047_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
