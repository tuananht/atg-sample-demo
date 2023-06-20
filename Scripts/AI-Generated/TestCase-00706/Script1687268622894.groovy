import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_robot-class-not-working-for-file-upload-in-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/robot-class-not-working-for-file-upload-in-mac/54693/2')

'step 2: Add visual checkpoint at Page_t_robot-class-not-working-for-file-upload-in-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00706_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
