import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_tip-how-to-help-us-help-you'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/tip-how-to-help-us-help-you/12919')

'step 2: Add visual checkpoint at Page_t_tip-how-to-help-us-help-you'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00065_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
