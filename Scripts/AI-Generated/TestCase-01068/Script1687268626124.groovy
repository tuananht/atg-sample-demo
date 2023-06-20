import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_cannot-launch-ios-application-app-on-simulator'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/cannot-launch-ios-application-app-on-simulator/32467')

'step 2: Add visual checkpoint at Page_t_cannot-launch-ios-application-app-on-simulator'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01068_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
