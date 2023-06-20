import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_unable-to-login-in-katalon-application'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/unable-to-login-in-katalon-application/49862')

'step 2: Add visual checkpoint at Page_t_unable-to-login-in-katalon-application'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00650_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
