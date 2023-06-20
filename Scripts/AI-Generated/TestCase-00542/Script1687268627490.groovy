import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_learn-css-selectors-with-6'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/learn-css-selectors-with-examples/49741/6')

'step 2: Add visual checkpoint at Page_t_learn-css-selectors-with-6'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00542_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
