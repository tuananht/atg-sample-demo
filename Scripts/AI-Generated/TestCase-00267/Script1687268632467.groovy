import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-does-one-open-1-normal-chrome-browser-and-1-incognito-chrome-3'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-does-one-open-1-normal-chrome-browser-and-1-incognito-chrome-browser/63724/3')

'step 2: Add visual checkpoint at Page_t_how-does-one-open-1-normal-chrome-browser-and-1-incognito-chrome-3'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00267_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
