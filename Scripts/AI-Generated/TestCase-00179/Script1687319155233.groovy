import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_maximize-chrome-headless-8'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/maximize-chrome-headless-window/9987/8')

'step 2: Add visual checkpoint at Page_t_maximize-chrome-headless-8'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00179_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()