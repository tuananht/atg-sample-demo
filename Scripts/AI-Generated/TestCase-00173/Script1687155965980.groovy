import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_rest-api-how-to-verify-everything-in-the-response'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/rest-api-how-to-verify-everything-in-the-response/37533')

'step 2: Add visual checkpoint at Page_t_rest-api-how-to-verify-everything-in-the-response'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00173_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
