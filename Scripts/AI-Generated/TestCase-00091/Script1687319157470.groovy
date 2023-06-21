import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_edge-in-ie-mode-how-to-disable-pop-up-block'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/edge-in-ie-mode-how-to-disable-pop-up-block/80974')

'step 2: Add visual checkpoint at Page_t_edge-in-ie-mode-how-to-disable-pop-up-block'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00091_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
