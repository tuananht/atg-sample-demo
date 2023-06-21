import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_chrome-not-loading-url-with-basic-auth'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/chrome-not-loading-url-with-basic-auth/35269')

'step 2: Add visual checkpoint at Page_t_chrome-not-loading-url-with-basic-auth'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00069_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
