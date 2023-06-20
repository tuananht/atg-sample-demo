import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-simulate-enter-key-press-in-katalon-7'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-simulate-enter-key-press-in-katalon-studio/8550/7')

'step 2: Add visual checkpoint at Page_t_how-to-simulate-enter-key-press-in-katalon-7'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01297_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
