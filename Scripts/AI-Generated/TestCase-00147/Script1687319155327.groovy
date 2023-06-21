import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_basic-authentication-in-web-service-request-exposes-8'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/basic-authentication-in-web-service-request-exposes-password/10722/8')

'step 2: Add visual checkpoint at Page_t_basic-authentication-in-web-service-request-exposes-8'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00147_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
