import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_cant-select-an-element-within-a-dropdown-menu'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/cant-select-an-element-within-a-dropdown-menu/10877')

'step 2: Add visual checkpoint at Page_t_cant-select-an-element-within-a-dropdown-menu'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01059_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
