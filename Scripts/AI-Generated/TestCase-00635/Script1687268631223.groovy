import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_continuous-integration-with-gitlab'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/continuous-integration-with-gitlab/25522')

'step 2: Add visual checkpoint at Page_t_continuous-integration-with-gitlab'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00635_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
