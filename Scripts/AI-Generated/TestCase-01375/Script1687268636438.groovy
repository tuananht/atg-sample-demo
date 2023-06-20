import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_implementing-nested-loops-into-my-9'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/implementing-nested-loops-into-my-test/68843/9')

'step 2: Add visual checkpoint at Page_t_implementing-nested-loops-into-my-9'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01375_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
