import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_menu-entries-of-the-git-menu-are-disabled-on-katalon-studio-start'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/menu-entries-of-the-git-menu-are-disabled-on-katalon-studio-start/58728')

'step 2: Add visual checkpoint at Page_t_menu-entries-of-the-git-menu-are-disabled-on-katalon-studio-start'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00220_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
