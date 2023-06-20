import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_getting-an-error-appium-directory-is-not-set-please-set-it-in-window-katalon-studio-preferences'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/getting-an-error-appium-directory-is-not-set-please-set-it-in-window-katalon-studio-preferences/11202')

'step 2: Add visual checkpoint at Page_t_getting-an-error-appium-directory-is-not-set-please-set-it-in-window-katalon-studio-preferences'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00298_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
