import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_scroll-to-element-in-dropdown-select-maybe-optgroup-problem'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/scroll-to-element-in-dropdown-select-maybe-optgroup-problem/17876')

'step 2: Add visual checkpoint at Page_t_scroll-to-element-in-dropdown-select-maybe-optgroup-problem'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00100_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()