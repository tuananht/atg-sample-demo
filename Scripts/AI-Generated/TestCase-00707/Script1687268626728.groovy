import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-set-chrome-browser-in-offline-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-set-chrome-browser-in-offline-mode/36113/3')

'step 2: Add visual checkpoint at Page_t_how-to-set-chrome-browser-in-offline-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00707_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
