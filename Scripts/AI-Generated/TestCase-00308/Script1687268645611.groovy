import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_katalon-docker-invalid-session-id'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/katalon-docker-invalid-session-id/29491')

'step 2: Add visual checkpoint at Page_t_katalon-docker-invalid-session-id'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00308_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
