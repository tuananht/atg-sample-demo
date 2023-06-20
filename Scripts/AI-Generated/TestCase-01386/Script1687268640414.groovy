import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-use-a-global-variable-in-a-different-test-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-use-a-global-variable-in-a-different-test-case/13032/2')

'step 2: Add visual checkpoint at Page_t_how-to-use-a-global-variable-in-a-different-test-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01386_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
