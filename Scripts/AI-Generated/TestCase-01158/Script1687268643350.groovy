import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_check-if-directory-contains-file-a-5'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/check-if-directory-contains-file-a-filename/51158/5')

'step 2: Add visual checkpoint at Page_t_check-if-directory-contains-file-a-5'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01158_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
