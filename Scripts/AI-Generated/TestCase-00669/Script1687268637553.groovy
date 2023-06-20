import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_unable-to-rename-test-object-or-folder-when-copied'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/unable-to-rename-test-object-or-folder-when-copied/50198')

'step 2: Add visual checkpoint at Page_t_unable-to-rename-test-object-or-folder-when-copied'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00669_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
