import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_after-renaming-moving-the-folder-in-object-repository-test-objects-strings-in-the-script-are-not-getting-updated'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/after-renaming-moving-the-folder-in-object-repository-test-objects-strings-in-the-script-are-not-getting-updated/55865')

'step 2: Add visual checkpoint at Page_t_after-renaming-moving-the-folder-in-object-repository-test-objects-strings-in-the-script-are-not-getting-updated'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00998_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
