import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_ctrl-click-to-select-multiple-items'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/ctrl-click-to-select-multiple-items/19251')

'step 2: Add visual checkpoint at Page_t_ctrl-click-to-select-multiple-items'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00332_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
