import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_hidden-iframe-intercepting-my-tests-clicks'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/hidden-iframe-intercepting-my-tests-clicks/60621')

'step 2: Add visual checkpoint at Page_t_hidden-iframe-intercepting-my-tests-clicks'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00141_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
