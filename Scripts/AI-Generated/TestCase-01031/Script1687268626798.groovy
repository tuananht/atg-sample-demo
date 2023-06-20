import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_to-verify-json-response-contains-expected-value'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/to-verify-json-response-contains-expected-value/12601')

'step 2: Add visual checkpoint at Page_t_to-verify-json-response-contains-expected-value'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01031_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
