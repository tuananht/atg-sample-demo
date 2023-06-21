import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_appium-directory-is-invalid-cannot-find-appium-6'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/appium-directory-is-invalid-cannot-find-appium-executable/8772/6')

'step 2: Add visual checkpoint at Page_t_appium-directory-is-invalid-cannot-find-appium-6'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00076_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()