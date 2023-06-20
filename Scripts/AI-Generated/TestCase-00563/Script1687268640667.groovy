import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_android-how-to-clear-application-data-and-cache-programmatically'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/android-how-to-clear-application-data-and-cache-programmatically/6315')

'step 2: Add visual checkpoint at Page_t_android-how-to-clear-application-data-and-cache-programmatically'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00563_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
