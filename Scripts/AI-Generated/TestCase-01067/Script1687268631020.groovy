import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_run-tests-every-x-hours'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/run-tests-every-x-hours/11316')

'step 2: Add visual checkpoint at Page_t_run-tests-every-x-hours'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01067_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
