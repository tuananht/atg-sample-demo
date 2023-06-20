import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-highlight-test-object-in-each-and-every-26'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-highlight-test-object-in-each-and-every-step/17408/26')

'step 2: Add visual checkpoint at Page_t_how-to-highlight-test-object-in-each-and-every-26'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01118_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
