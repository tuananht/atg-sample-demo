import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_katalon-does-not-recognize-own-opened-chrome-as-active-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/katalon-does-not-recognize-own-opened-chrome-as-active-browser/9148/3')

'step 2: Add visual checkpoint at Page_t_katalon-does-not-recognize-own-opened-chrome-as-active-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01138_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
