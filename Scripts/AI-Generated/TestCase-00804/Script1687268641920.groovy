import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_is-there-a-way-to-extract-a-profile-into-a-csv'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/is-there-a-way-to-extract-a-profile-into-a-csv/87809')

'step 2: Add visual checkpoint at Page_t_is-there-a-way-to-extract-a-profile-into-a-csv'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00804_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
