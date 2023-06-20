import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_limitations-on-katalon-studio-7'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/limitations-on-katalon-studio-free/38725/7')

'step 2: Add visual checkpoint at Page_t_limitations-on-katalon-studio-7'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01343_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
