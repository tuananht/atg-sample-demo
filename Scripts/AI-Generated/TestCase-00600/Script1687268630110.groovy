import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_read-google-sheet-api-exceptionininitializererror'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/read-google-sheet-api-exceptionininitializererror/81872')

'step 2: Add visual checkpoint at Page_t_read-google-sheet-api-exceptionininitializererror'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00600_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
