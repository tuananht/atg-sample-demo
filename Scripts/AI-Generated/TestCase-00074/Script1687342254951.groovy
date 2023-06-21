import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_is-there-a-way-to-get-the-current-date-and-time-modify-them-and-use-as-a-new-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/is-there-a-way-to-get-the-current-date-and-time-modify-them-and-use-as-a-new-input/6501/2')

'step 2: Add visual checkpoint at Page_t_is-there-a-way-to-get-the-current-date-and-time-modify-them-and-use-as-a-new-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00074_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
