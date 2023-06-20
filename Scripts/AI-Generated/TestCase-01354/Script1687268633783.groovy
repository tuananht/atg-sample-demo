import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_can-you-anyone-know-how-to-use-translate-method-in-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/can-you-anyone-know-how-to-use-translate-method-in-xpath/12360/2')

'step 2: Add visual checkpoint at Page_t_can-you-anyone-know-how-to-use-translate-method-in-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01354_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
