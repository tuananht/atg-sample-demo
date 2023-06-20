import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_getting-you-need-to-enable-javascript-to-run-this-app-message-in-chrome-headless'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/getting-you-need-to-enable-javascript-to-run-this-app-message-in-chrome-headless/83372')

'step 2: Add visual checkpoint at Page_t_getting-you-need-to-enable-javascript-to-run-this-app-message-in-chrome-headless'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00385_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
