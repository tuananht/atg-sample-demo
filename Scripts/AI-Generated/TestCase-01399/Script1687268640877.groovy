import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_get-xhr-response-and-parse-9'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/get-xhr-response-and-parse-it/18097/9')

'step 2: Add visual checkpoint at Page_t_get-xhr-response-and-parse-9'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01399_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
