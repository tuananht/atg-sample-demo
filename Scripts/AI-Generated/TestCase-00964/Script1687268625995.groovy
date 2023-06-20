import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_cannot-select-date-from-datepicker-dialog-android'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/cannot-select-date-from-datepicker-dialog-android/14274')

'step 2: Add visual checkpoint at Page_t_cannot-select-date-from-datepicker-dialog-android'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00964_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
