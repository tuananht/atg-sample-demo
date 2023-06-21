import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_getting-you-need-to-enable-javascript-to-run-this-app-message-in-chrome-20'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/getting-you-need-to-enable-javascript-to-run-this-app-message-in-chrome-headless/83372/20')

'step 2: Add visual checkpoint at Page_t_getting-you-need-to-enable-javascript-to-run-this-app-message-in-chrome-20'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00189_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
