import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_two-array-list-in-two-test-cases'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/two-array-list-in-two-test-cases/62723')

'step 2: Add visual checkpoint at Page_t_two-array-list-in-two-test-cases'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00451_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
