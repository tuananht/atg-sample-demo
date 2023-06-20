import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-does-one-get-katalon-to-handle-asynchronous-executejavascript-13'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-does-one-get-katalon-to-handle-asynchronous-executejavascript-calls/83860/13')

'step 2: Add visual checkpoint at Page_t_how-does-one-get-katalon-to-handle-asynchronous-executejavascript-13'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01358_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
