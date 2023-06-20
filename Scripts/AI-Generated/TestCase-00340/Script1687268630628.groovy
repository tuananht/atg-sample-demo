import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_error-build-to-xcode-routinghttpserver-routingconnection-h-file-not-found'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/error-build-to-xcode-routinghttpserver-routingconnection-h-file-not-found/23190')

'step 2: Add visual checkpoint at Page_t_error-build-to-xcode-routinghttpserver-routingconnection-h-file-not-found'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00340_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
