import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_node-js-not-31'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/node-js-not-installed/8361/31')

'step 2: Add visual checkpoint at Page_t_node-js-not-31'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00154_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
